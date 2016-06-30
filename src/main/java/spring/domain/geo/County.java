package spring.domain.geo;

import spring.domain.Organisation;
import spring.domain.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jakub on 22.06.16.
 */
@Entity
public class County implements Serializable {
    @Id
    private String id;
    @OneToMany(mappedBy="citizen")
    private Set<User> citizens=new HashSet<>();
    @OneToMany(mappedBy="location")
    private Set<Organisation> organisations=new HashSet<>();

    public County(String id, Set<User> citizens) {
        this.id = id;
        this.citizens = citizens;
    }

    public County(String id) {
        this.id = id;
    }

    public County() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<User> getCitizens() {
        return citizens;
    }

    public void setCitizens(Set<User> citizens) {
        this.citizens = citizens;
    }
    public void addCitizen(User citizen) {
        this.citizens.add(citizen);
    }
    public void removeCitizen(User citizen) {
        this.citizens.remove(citizen);
    }

    public Set<Organisation> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(Set<Organisation> organisations) {
        this.organisations = organisations;
    }
    public void addOrganisation(Organisation organisation) {
        this.organisations.add(organisation);
    }
    public void removeOrganisation(Organisation organisation) {
        this.organisations.remove(organisation);
    }
}
