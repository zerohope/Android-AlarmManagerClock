package Model;

import org.litepal.crud.DataSupport;

/**
 * Created by A on 2017/6/4.
 */

public class Times extends DataSupport {
    private String time;
    private String date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
