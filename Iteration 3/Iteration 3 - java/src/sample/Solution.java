package sample;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        Summary summary1 = new Summary("1507651124", "2750", "Positiv", "20210101", "B.1.1.7", "B.1.1.7");
            System.out.println(summary1);
            File file = new File("summary1-output.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Summary.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(summary1, file);
            jaxbMarshaller.marshal(summary1, System.out);
        }

    }