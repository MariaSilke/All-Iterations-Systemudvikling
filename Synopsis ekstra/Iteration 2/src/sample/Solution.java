package sample;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        Patients patients1 = new Patients("Dorte", "Kristensen", "+4523456671", "121201-1212");
        System.out.println(patients1);
        File file = new File("patients1-output.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Patients.class);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(patients1, file);
        jaxbMarshaller.marshal(patients1, System.out);
    }

}