package kodlama.io.demo.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.demo.business.abstracts.ProgrammingLanguageService;
import kodlama.io.demo.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.demo.business.responses.GetAllProgrammingLanguagesResponse;

@RestController //Annotation -- Bilgilendirme ifadesi
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired // check parameters and scan application
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	@GetMapping("/getbyid")
	public GetAllProgrammingLanguagesResponse getById(@RequestParam int id) {
		return programmingLanguageService.getResponseById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}		
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest,@PathVariable int id) throws Exception {
		programmingLanguageService.update(createProgrammingLanguageRequest, id);
	}
	
	@DeleteMapping ("/delete/{id}")
	public void delete(@PathVariable int id) throws Exception{
		programmingLanguageService.delete(id);
	}
	
}
