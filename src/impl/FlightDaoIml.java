package impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml  implements IFlightDao {
    public <PreparedStatemnt> void   Flight(Flight flight)  throws Exception{
        String  ur1="jdbc:oracle:thin:@localhost:1521:o'clock";
        String  username="opts";
        String  password="opts1234";
        Connection conn= DriverManager.getConnection(ur1,username,password);
        System.out.println("当前连接:"+conn);
        PreparedStatemnt  pasmt;

    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
