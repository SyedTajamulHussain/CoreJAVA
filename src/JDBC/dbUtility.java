package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dbUtility {

                Connection con;
                Statement smt;
                ResultSet rs;

                Map<String, List<String>> objHashmap = new HashMap<String, List<String>>();

                public dbUtility() throws Exception {
                                Class.forName("org.postgresql.Driver");
                                System.out.println("Driver Loaded");
                                con = DriverManager.getConnection("jdbc:postgresql://172.31.26.153:5439/datamart_qa", "qa_user", "Europian123");
                                System.out.println("Connected to Database");

                }

                public Map<String, List<String>> executeQuery(String query) throws Exception {
                                smt = con.createStatement();

                                rs = smt.executeQuery(query.trim());

                                List<String> objTopic = new ArrayList<String>();
                                List<String> objCountry = new ArrayList<String>();
                                List<String> objChannel = new ArrayList<String>();
                                List<String> objDenominator = new ArrayList<String>();
                                List<String> objDate = new ArrayList<String>();

                                while (rs.next()) {
                                                
                                                objTopic.add(rs.getString("display_topic_name").toString().trim());
                                                objCountry.add(rs.getString("geo_name").toString().trim());
                                                objChannel.add(rs.getString("channel_type").toString().trim());
                                                objDenominator.add(rs.getString("denominator").toString().trim());
                                                objDate.add(rs.getString("date").toString().trim());

                                }

                                objHashmap.put("display_topic_name", objTopic);
                                objHashmap.put("geo_name", objCountry);
                                objHashmap.put("channel_type", objChannel);
                                objHashmap.put("denominator", objDenominator);
                                objHashmap.put("date", objDate);


                                return objHashmap;

                }

                public void closeConnection() throws Exception {
                                if (con != null) {
                                                con.close();
                                }
                }
}
