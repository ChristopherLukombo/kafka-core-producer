package com.course.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.course.kafka.producer.Image2Producer;
import com.course.kafka.producer.InvoiceProducer;
import com.course.kafka.producer.InvoiceService;
import com.course.kafka.service.ImageService;

@EnableScheduling
@SpringBootApplication
public class KafkaCoreProducerApplication implements CommandLineRunner {
	
//	@Autowired
//	private HelloKafkaProducer producer;
//	@Autowired
//	private KafkaKeyProducer producer;
	
//	@Autowired
//	private EmployeeJsonProducer producer;
	
//	@Autowired
//	private Employee2JsonProducer producer;
	
//	@Autowired
//	private PurchaseRequestProducer producer;
	
//	@Autowired
//	private PaymentRequestProducer producer;
	
//	@Autowired
//	private FoodOrderProducer producer;
//	
//	@Autowired
//	private SimpleNumberProducer simpleNumberProducer;
	
	@Autowired
	private ImageService imageService;
//	
//	@Autowired
//	private ImageProducer producer;
	
//	@Autowired
//	private InvoiceService invoiceService;
	
	
	@Autowired
	private Image2Producer image2Producer;
	
	@Autowired
	private InvoiceProducer invoiceProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaCoreProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		producer.sendHello("Timotius " + ThreadLocalRandom.current().nextInt());
//		for (int i = 0; i < 10_000; i++) {
//			var key = "key-" + (i% 4);
//			var value = "value " + i + " with key " + key;
//			producer.send(key, value);
//			TimeUnit.SECONDS.sleep(1);
//		}
//		for (int i = 0; i < 5; i++) {
//			var emp = new Employee("emp-" + i , "Employee" + i, LocalDate.now());
//			producer.sendMessage(emp);
//		}
		
		
//		var pr1 = new PurchaseRequest(5551, "PR-First", 991, "USD");
//		var pr2 = new PurchaseRequest(5552, "PR-Second", 992, "USD");
//		var pr3 = new PurchaseRequest(5553, "PR-Three", 993, "USD");
//		
//		producer.send(pr1);
//		producer.send(pr2);
//		producer.send(pr3);
//		
//		producer.send(pr1);
		
//		var paymentRequestAlpha_Transaction1 = new PaymentRequest("Pay-Alpha", 551, "USD", "Notes alpha", "Budget reserve");
//		var paymentRequestAlpha_Transaction2 = new PaymentRequest("Pay-Alpha", 551, "USD", "Notes alpha", "Approval workflow");
//		var paymentRequestAlpha_Transaction3 = new PaymentRequest("Pay-Alpha", 551, "USD", "Notes alpha", "Push notifivation");
//		var paymentRequestBeta_Transaction1 = new PaymentRequest("Pay-Beta", 551, "USD", "Notes alpha", "Budget reserve");
//		var paymentRequestBeta_Transaction2 = new PaymentRequest("Pay-Beta", 551, "USD", "Notes alpha", "Approval workflow");
//		var paymentRequestBeta_Transaction3 = new PaymentRequest("Pay-Beta", 551, "USD", "Notes alpha", "Push notifivation");
//		
//		producer.send(paymentRequestAlpha_Transaction1);
//		producer.send(paymentRequestAlpha_Transaction2);
//		producer.send(paymentRequestAlpha_Transaction3);
//		producer.send(paymentRequestBeta_Transaction1);
//		producer.send(paymentRequestBeta_Transaction2);
//		producer.send(paymentRequestBeta_Transaction3);
//
//		producer.send(paymentRequestAlpha_Transaction2);
//		producer.send(paymentRequestBeta_Transaction3);
		
//		var chickenOrder = new FoodOrder(3, "Chicken");
//		var fishOrder = new FoodOrder(10, "Fish");
//		var pizzaOrder = new FoodOrder(5, "Pizza");
//		
//		producer.send(chickenOrder);
//		producer.send(fishOrder);
//		producer.send(pizzaOrder);
//		
//		for (int i = 100; i < 103; i++) {
//			var simpleNumber = new SimpleNumber(i);
//			simpleNumberProducer.send(simpleNumber);
//		}
		
//		var image1 = imageService.generateImage("jpg");
//		var image2 = imageService.generateImage("svg");
//		var image3 = imageService.generateImage("png");
//		var image4 = imageService.generateImage("gif");
//		var image5 = imageService.generateImage("bmp");
//		var image6 = imageService.generateImage("tiff");
//		
//		producer.send(image1, 0);
//		producer.send(image2, 0);
//		producer.send(image3, 0);
//		producer.send(image4, 1);
//		producer.send(image5, 1);
//		producer.send(image6, 1);
		
//		for (int i = 0; i < 10; i++) {
//			var invoice = invoiceService.generateInvoice();
//			
//			if (i > 5) {
//				invoice.setAmount(0);
//			}
//			
//			invoiceProducer.send(invoice);
//		}
		
		var image1 = imageService.generateImage("jpg");
		var image2 = imageService.generateImage("svg");
		var image3 = imageService.generateImage("gif");
		var image4 = imageService.generateImage("gif");
		var image5 = imageService.generateImage("gif");
		var image6 = imageService.generateImage("gif");
		
		image2Producer.send(image1, 0);
		image2Producer.send(image2, 0);
		image2Producer.send(image3, 0);
		image2Producer.send(image4, 1);
		image2Producer.send(image5, 1);
		image2Producer.send(image6, 1);
	}
}
