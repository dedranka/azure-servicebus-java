package com.estudos.dedranka.listener;

import org.springframework.stereotype.Component;

import com.estudos.dedranka.model.SampleModel;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AzureServiceBusQueueListener {

	private final static String QUEUE_NAME = "teste01";

	@org.springframework.jms.annotation.JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
	public void receive(SampleModel msg) {

		log.info("Recebendo Mensagem da fila");

		try {
			log.info("Mensagem:" + msg.toString());
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.getMessage());
		}

	}
}
