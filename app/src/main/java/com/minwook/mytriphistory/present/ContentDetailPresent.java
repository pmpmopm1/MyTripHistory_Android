package com.minwook.mytriphistory.present;

import com.minwook.mytriphistory.DAO.Content;

public interface ContentDetailPresent {

    void loadData(int position);

    interface View{
        void setText(Content content);
        void addMarker(double latitude, double longtitude, String title);
        void setCenterMap(double latitude, double longtitude);
    }
}
