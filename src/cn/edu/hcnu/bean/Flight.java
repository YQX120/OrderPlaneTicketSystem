package cn.edu.hcnu.bean;

public class Flight {
    private String id;//主键，UUID，主键不应该具有任何的业务意义
    private String flightID;
    private String planeType;//航班类型
    private int currentSeatsNum;//总座位数
    private String departureAirport;//出发地
    private String destinationAirport;//目的地
    private String departureTime;//时间

    public Flight(String id,String flightID,String planeType,int currentSeatsNum,String departureAirport,
                  String destinationAirport,String departureTime) {

        this.id = id;
        this.flightID = flightID;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;

    }
        public String getId () {
            return id;
        }

        public void setId (String id){
            this.id = id;
        }

        public String getFlightID () {
            return flightID;
        }

        public void setFlightID (String flightID){
            this.flightID = flightID;
        }

        public String getPlaneType () {
            return planeType;
        }

        public void setPlaneType (String planeType){
            this.planeType = planeType;
        }

        public int getCurrentSeatsNum () {
            return currentSeatsNum;
        }

        public void setCurrentSeatsNum ( int currentSeatsNum){
            this.currentSeatsNum = currentSeatsNum;
        }

        public String getDepartureAirport () {
            return departureAirport;
        }

        public void setDepartureAirport (String departureAirport){
            this.departureAirport = departureAirport;
        }

        public String getDestinationAirport () {
            return destinationAirport;
        }

        public void setDestinationAirport (String destinationAirport){
            this.destinationAirport = destinationAirport;
        }

        public String getDepartureTime () {
            return departureTime;
        }

        public void setDepartureTime (String departureTime){
            this.departureTime = departureTime;
        }

        @Override
        public String toString () {
            return "Flight{" +
                    "flightID='" + flightID + '\'' +
                    ", planeType='" + planeType + '\'' +
                    ", currentSeatsNum=" + currentSeatsNum +
                    ", departureAirport='" + departureAirport + '\'' +
                    ", destinationAirport='" + destinationAirport + '\'' +
                    ", departureTime='" + departureTime + '\'' +
                    '}';
        }

}

