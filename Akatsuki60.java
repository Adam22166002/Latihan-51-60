package akatsuki;
/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * SALDO TARGET TABUNGAN
 */
public class Akatsuki60 {
    private final String name;
    private final String village;
    private final String jutsu;

    public Akatsuki60(String name, String village, String jutsu) {
        this.name = name;
        this.village = village;
        this.jutsu = jutsu;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public String getJutsu() {
        return jutsu;
    }

    public String performJutsu() {
        return "Pengguna jutsu: " + jutsu;
    }
}
class AkatsukiMember extends Akatsuki60 {
    private final String ability;

    public AkatsukiMember(String name, String village, String jutsu, String ability) {
        super(name, village, jutsu);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    public String performSpecialAbility() {
        return "Kemampuan " + ability;
    }
}
class AkatsukiLeader extends Akatsuki60 {
    private final String leadership;

    public AkatsukiLeader(String name, String village, String jutsu, String leadership) {
        super(name, village, jutsu);
        this.leadership = leadership;
    }

    public String getLeadership() {
        return leadership;
    }
}
 class MainProgram {
    public static void main(String[] args) {
        AkatsukiMember member = new AkatsukiMember("Uchiha Itachi", "Konohagakure", "Mata Sharingan", "Amaterasu");
        AkatsukiLeader leader = new AkatsukiLeader("Pain", "Amegakure", "Rinnegan", "Mastermind Tactics");

        displayCharacterInfo(member);
        displayCharacterInfo(leader);
    }

    private static void displayCharacterInfo(Akatsuki60 character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Village: " + character.getVillage());
        System.out.println("Jutsu: " + character.getJutsu());
        System.out.println(character.performJutsu());

        if (character instanceof AkatsukiMember) {
            AkatsukiMember member = (AkatsukiMember) character;
            System.out.println("Special Kemampuan: " + member.getAbility());
            System.out.println(member.performSpecialAbility());
        } else if (character instanceof AkatsukiLeader) {
            AkatsukiLeader leader = (AkatsukiLeader) character;
            System.out.println("Leadership Style: " + leader.getLeadership());
        }
    }
}
