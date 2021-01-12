package cn.edu.hcnu.bean;

public class Flight {
    private String id;
    private String planeType;//航班类型
    private String SeatsNo;//座位号
    private String totalSeatsNum;//总座位数
    private String departureAirport;//出发地
    private String destinationAirport;//目的地
    private String departureTime;//时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getSeatsNo() {
        return SeatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        SeatsNo = seatsNo;
    }

    public String getTotalSeatsNum() {
        return totalSeatsNum;
    }

    public void setTotalSeatsNum(String totalSeatsNum) {
        this.totalSeatsNum = totalSeatsNum;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}

