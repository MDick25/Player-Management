package entity;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer extends User implements Serializable {
	
	public Trainer() {}
	public Trainer(Long id, String name, String phone, String address, LocalDate birthDate, String login, String password, Boolean status) {
		super(id, name, phone, address, birthDate, login, password, status);
	}
}
