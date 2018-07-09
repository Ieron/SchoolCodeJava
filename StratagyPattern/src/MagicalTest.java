//Main Test Class
public class MagicalTest {

	public static void main(String[] args) {
		
		//create dwarf, elf, and programmer objects
		Magical dwarf = new Dwarf();
		Magical elf = new Elf();
		Magical programmer = new Programmer();
		
		//tests dwarf behaviors
		dwarf.lookAt();
		dwarf.castASpell();
		dwarf.writeASpell();
		
		System.out.println("___________\n");
		//tests elf behaviors
		elf.lookAt();
		elf.castASpell();
		elf.writeASpell();
		elf.setWriteSpell(new MakeRune());
		elf.writeASpell();
		
		System.out.println("___________\n");
		//tests programmer behaviors
		programmer.lookAt();
		programmer.castASpell();
		programmer.writeASpell();
		
	}

}
