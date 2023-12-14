package roomescape.domain;

public class Reservation {
    private Long id;
    private String name;
    private String date;
    private Time time;

    public Reservation(Long id, String name, String date, Time time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTimeId() {
        return time.getId();
    }

    public void setTimeId(Long id) {
        time.setId(id);
    }

    public String getTimeValue() {
        return time.getTime();
    }

    public void setTimeValue(String value) {
        time.setTime(value);
    }
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
