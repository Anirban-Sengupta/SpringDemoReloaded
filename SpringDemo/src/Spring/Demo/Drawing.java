package Spring.Demo;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class Drawing {

	public static void main(String[] args) {
    /*Resource resource=new ClassPathResource("SpringXML.xml");
	BeanFactory fac=new XmlBeanFactory(resource);
	Triangle triangle = (Triangle)fac.getBean("triangle");*/
    ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("SpringXML.xml");
    Triangle triangle = (Triangle)cont.getBean("triangle");
	triangle.draw();
	}

}