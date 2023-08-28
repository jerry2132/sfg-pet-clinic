package sumit.springframework.sfgpetclinic;

public interface OwnerService {

	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
