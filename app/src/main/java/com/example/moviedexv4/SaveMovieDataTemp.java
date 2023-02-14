package com.example.moviedexv4;

import android.app.Application;
import android.util.Log;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
public class SaveMovieDataTemp
{
    public void moviedata(String Dates, String Title, String Watched,Context context) throws IOException
    {
        SaveMovieDataFile F = new SaveMovieDataFile();
        String Entry = Dates + " - " + Watched + " - " + Title;
        F.FileSave("MovieLogs.txt", Entry, context);
    }
}

