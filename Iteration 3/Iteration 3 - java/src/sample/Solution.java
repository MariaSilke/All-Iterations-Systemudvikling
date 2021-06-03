package sample;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(Summary.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // write XML to `StringWriter`
            File file = new File("summary.xml");

            // create `Book` object
            Summary summary = new Summary("1507651124", "2750", "Positiv", "20210101", "B.1.1.7", "B.1.1.7");

            // convert book object to XML
            marshaller.marshal(summary, file);

            // print the XML
            System.out.println(file.toString());

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }

        }

    }


