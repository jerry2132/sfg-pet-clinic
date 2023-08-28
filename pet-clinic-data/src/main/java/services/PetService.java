package sumit.springframework.sfgpetclinic;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();

}
