package com.estudos.jms.application.scheduller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.estudos.jms.application.model.SampleModel;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JMSPublisherSqueduller {
	@Autowired
	private JmsTemplate jmsTemplate;
	
	static String queueName = "teste01";

	public JMSPublisherSqueduller() {

	}

	@Scheduled(fixedRate = 10000)
	public void run() {
		try {
			log.info("INICIO DO PROCESSAMENTO :" + new Date());
			SampleModel s = new SampleModel();
			int id = (int) new Date().getTime();
			s.setId(id);
			s.setDescription("teste Mensagem;" + new Date().toGMTString());
			
			jmsTemplate.convertAndSend(queueName,s);
			log.info("FIM DO PROCESSAMENTO:" + new Date());

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

}
