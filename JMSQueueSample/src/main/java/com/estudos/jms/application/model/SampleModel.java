package com.estudos.jms.application.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleModel implements Serializable {

	private int id;
	private String description;
	
}
