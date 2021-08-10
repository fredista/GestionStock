package org.sid;

import org.sid.dao.TaskRepository;
import org.sid.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionTacheApplication  implements CommandLineRunner{
	
	@Autowired
	TaskRepository taskrepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionTacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub 
		
		//taskrepository.save(new Task("vister mon ami",false));
		//taskrepository.save(new Task("causer avec jean marie",false));
		//taskrepository.save(new Task("envoyer un message a chantal",false));
		//taskrepository.save(new Task("preparer le resultat",false));
		//taskrepository.save(new Task("esperons le bon resultat",false));
		//taskrepository.save(new Task("se preparer pour affronter le defi",false));
		//taskrepository.save(new Task("faire la cuisine plus tard",false));
		//taskrepository.save(new Task("preparer la PU",false));
		//taskrepository.save(new Task("chanter un cantique",false));
		//taskrepository.save(new Task("vive le president",false));
		//taskrepository.save(new Task("chercher les infos du tchad",false));
		//taskrepository.save(new Task("envoyer un mssage a fideli",false));
		//taskrepository.save(new Task("Victoire sur les tenenbres",false));
		//taskrepository.save(new Task("Travailler dur",false));
		
		
	}

}
