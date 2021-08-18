import org.sql2o.*;

public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife", "naphtali", "1606525");

    static String connectionString = "jdbc:postgresql://ec2-52-1-115-6.compute-1.amazonaws.com:5432/d59hq9a9difhht"; //!
    static Sql2o sql2o = new Sql2o(connectionString, "ysipcoszeiacje", "612a61ae4a22924cd838cf201248e4a74672b5472491f7b81d5288ad5dac7270");
}