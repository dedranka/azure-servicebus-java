package com.estudos.jms.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.jms.application.model.SampleModel;

@RestController
public class SampleController {

	@GetMapping("/samples")
	public List<SampleModel> getAll() {
		List<SampleModel> samples = new ArrayList<>();
		SampleModel s = new SampleModel();
		s.setId(1);
		s.setDescription("Teste de micoservicos ");
		samples.add(s);

		return samples;
	}

	
	@GetMapping("/sample/{id}")
	public SampleModel get(@PathVariable("id") int id) {
		SampleModel sample = new SampleModel();
		sample.setId(id);
		sample.setDescription("Teste de micoservicos " + id);
		
		return sample;
	}
}
