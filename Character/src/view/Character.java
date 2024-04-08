package view;

public class Character {
    private String job;
    private String name;
    private String gender;
    private String server;

    public Character(String job, String name, String gender, String server) {
        this.job = job;
        this.name = name;
        this.gender = gender;
        this.server = server;
    }

    @Override
    public String toString() {
        return "Job: " + job + " | Name: " + name + " | Gender: " + gender + " | Server: " + server;
    }
    public String getName() {
    	return name;
    }
    public void setName(String newName) {
    	this.name = newName;
    }

}
