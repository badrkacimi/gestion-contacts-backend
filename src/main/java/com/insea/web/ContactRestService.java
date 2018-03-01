package com.insea.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insea.dao.ContactRepository;
import com.insea.entities.Contact;

@RestController
@CrossOrigin("*")
public class ContactRestService {
	@Autowired
	private ContactRepository contactRepository ;
	
	@RequestMapping(value="/Contacts",method=RequestMethod.GET)
	 public List<Contact> getContacts(){
    
		return contactRepository.findAll();
	}
	
	//@GetMapping(value="/Contacts/{id)")
  @RequestMapping(value="/Contacts/{id}" ,method=RequestMethod.GET)
	        public Contact getContact(@PathVariable Long id){
		
          return contactRepository.findOne(id);
	}
	@RequestMapping(value="/Contacts" ,method=RequestMethod.POST)
	 public Contact  SaveContact(@RequestBody Contact c){
		
         return contactRepository.save(c);
	}
	@RequestMapping(value="/Contacts/{id}" ,method=RequestMethod.DELETE)
	 public boolean  SupprimerContact(@PathVariable Long id){
		
      contactRepository.delete(id);
      return true;
	}
	
	@RequestMapping(value="/Contacts/{id}" ,method=RequestMethod.PUT)
	 public Contact  updateContact(@PathVariable Long id ,@RequestBody Contact c){
		c.setId(id);
        return contactRepository.save(c);
	}
	
	@RequestMapping(value="/Contacts/afficher/{a}" ,method=RequestMethod.GET)
	 public String  Afficher(@PathVariable String a){
		
				return "Bonjour  " + a;
	}
	@RequestMapping(value="/SearchContacts",method=RequestMethod.GET)
	 public Page<Contact> SearchContacts(
			 @RequestParam(name="mc", defaultValue="")String mc,
			 @RequestParam(name="page", defaultValue="0")int page,
			 @RequestParam(name="size", defaultValue="5")int size){
   
		return contactRepository.Chercher("%"+mc+"%" , new PageRequest(page, size));
	}
}
