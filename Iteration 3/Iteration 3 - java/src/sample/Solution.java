package sample;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        Summary summary1 = XMLtoSummaryExample("summary1.xml");
        System.out.println(person);
        summary1ToXMLExample("summary1-output.xml", summary1);
    }

    private static Summary XMLtoSummaryExample(String filename) throws Exception {
        File file = new File(filename);
        JAXBContext jaxbContext = JAXBContext.newInstance(Summary.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Summary) jaxbUnmarshaller.unmarshal(file);
    }

    private static void summary1ToXMLExample(String filename, Summary summary1) throws Exception {
        File file = new File(filename);
        JAXBContext jaxbContext = JAXBContext.newInstance(Summary.class);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(summary1, file);
        jaxbMarshaller.marshal(summary1, System.out);
    }
}
