package it.prova.dao.user;

import java.util.Date;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {
	//Da implementare i metodi che servono nel Service
	
	//cercaTuttiQuelliCheUsernameIniziaCon
	public List<User> findAllByLoginIniziaCon(String inizialeLogin) throws Exception;
	
	//cercaTuttiQuelliCreatiPrimaDi
	public List<User> findAllByDateCreatedBefore(Date dataConfronto) throws Exception;
	
	//cercaPerCognomeENomeCheInziaCon  SOLO NOME DOBBIAMO FARE IL LIKE  cognome = e nome like
	public List<User> findAllByCognomeAndNomeStartWith(String cognomeInput, String inzialeNomeInput) throws Exception;

	public User accedi(String loginInput, String passwordInput) throws Exception;
	
}
