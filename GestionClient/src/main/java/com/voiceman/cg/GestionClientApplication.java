package com.voiceman.cg;

import java.util.Collection;import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.voiceman.cg.entities.Agents;
import com.voiceman.cg.entities.CMD;
import com.voiceman.cg.entities.Clients;
import com.voiceman.cg.entities.RDV;
import com.voiceman.cg.entities.UserProjet;
import com.voiceman.cg.entities.Users;
import com.voiceman.cg.entities.typeProjet;
import com.voiceman.cg.repository.CmdRepository;
import com.voiceman.cg.repository.RdvRepository;
import com.voiceman.cg.repository.TypeProjetRepository;
import com.voiceman.cg.repository.UserRepository;

@SpringBootApplication
public class GestionClientApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TypeProjetRepository typeProjetRepository;
	@Autowired
	private RdvRepository rdvRepository;
	@Autowired
	private CmdRepository cmdRepository;

	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionClientApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
	
		typeProjet tp1 = typeProjetRepository.save(new typeProjet(null, "Docteur"));
		typeProjet tp2 = typeProjetRepository.save(new typeProjet(null, "Restaurant"));
		
		Users user1 = userRepository.save(new Agents(null, "Soukaina", "Elena", "FES, treq sefrou", "0980654321", "Femme", "Elena", "ElenaSouki","*****"));
		Users user2 = userRepository.save(new Clients(null, "Achraf", "hadri", "Sefrou" , "0987654321", "homme"));
		Users user3 = userRepository.save(new UserProjet(null, "Docteur1", "Doc1", "Immouzer kander", "0987654321", "Homme", "Doc1", "Doc1"));
	
		Users user4 = userRepository.save(new Agents(null, "El hamdane", "Imad", "FES, narjiss", "0980654321", "homme", "login1", "login1","*****"));
		Users user5 = userRepository.save(new Clients(null, "client1", "cmd", "mekness" , "0987654321", "homme"));
		Users user9 = userRepository.save(new UserProjet(null, "Gerant1", "ger1", "Rabat" , "0987654321", "femme", "gerant1", "gerant1"));
		
		/*
		 * UserProjet usrprj = usrPrjRepository.save(new UserProjet(null, "Gerant2",
		 * "ger2", "CASA" , "0987654321", "femme", "gerant2", "gerant2")); typeProjet
		 * typeuser1 = typeProjetRepository.save(new typeProjet(null, "Restaurant",
		 * usrprj));
		 */
		RDV rdv1 = rdvRepository.save(new RDV(null, new Date(),"grippe", new Date(), new Date(), user9));
		RDV rdv2 = rdvRepository.save(new RDV(null, new Date(),"fievre", new Date(), new Date(), user2));
		
		CMD cmd1 = cmdRepository.save(new CMD(null, "pizza", new Date(), new Date(), 4, user5 ));
		CMD cmd2 = cmdRepository.save(new CMD(null, "chawarma", new Date(), new Date(), 4, user4 ));
		
				
	}

}
