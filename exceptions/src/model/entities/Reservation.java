package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(){}

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = this.checkOut.getTime() - this.checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut ) {
        Date dateNow = new Date();
        if(checkIn.before(dateNow) || checkOut.before(dateNow)){
            return "Reservation dates for update must be future";
        } else if (!checkOut.after(checkIn)) {
            return "Check-out must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Room " + this.roomNumber);
        stringBuilder.append(", check-in: " + simpleDateFormat.format(checkIn));
        stringBuilder.append(", check-out: " + simpleDateFormat.format(checkOut) + ", ");
        stringBuilder.append(duration());
        stringBuilder.append(" nights");
        return stringBuilder.toString();
    }
}
