import org.sql2o.*;

import java.util.List;

public class Animals {

    private String name;
    private String ranger;
    private String age;
    private String location;
    private String health;
    private String status;
    private String spottime;
    private int id;

    public Animals(String name, String ranger, String age, String location, String health, String status){
        this.name = name;
        this.ranger = ranger;
        this.age = age;
        this.location = location;
        this.health = health;
        this.status = status;
        this.spottime = spottime;


    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }


    public int getId() {
        return id;
    }

    public String getSpotted() {
        return spottime;
    }


    public static List<Animals> all() {
        String sql = "SELECT name, ranger, age, location, health, status FROM animals";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Animals.class);
        }
    }

    @Override
    public boolean equals(Object otherAnimal) {
        if (!(otherAnimal instanceof Animals)) {
            return false;
        } else {
            Animals newAnimal = (Animals) otherAnimal;
            return this.getName().equals(newAnimal.getName()) &&
                    this.getRanger().equals(newAnimal.getRanger()) &&
                    this.getAge().equals(newAnimal.getAge()) &&
                    this.getLocation().equals(newAnimal.getLocation()) &&
                    this.getHealth().equals(newAnimal.getHealth()) &&
                    this.getStatus().equals(newAnimal.getStatus()) &&
                    this.getId() == newAnimal.getId();

        }
    }

    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name, ranger, age, location, health, status ) VALUES (:name, :ranger, :age, :location, :health, :status)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("ranger", this.ranger)
                    .addParameter("age", this.age)
                    .addParameter("location", this.location)
                    .addParameter("health", this.health)
                    .addParameter("status", this.status)
                    .executeUpdate()
                    .getKey();
        }
    }
}