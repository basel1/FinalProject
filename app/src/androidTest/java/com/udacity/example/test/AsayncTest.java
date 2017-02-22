package com.udacity.example.test;

/**
 * Created by Basel on 22/02/2017.
 */

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import static junit.framework.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class AsayncTest  {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    @Test
    public void testAsaync() {

        final EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        String result=null;

       // new Runnable(){
         //   public void run(){
                endpointsAsyncTask.execute(mActivityRule.getActivity());
           // }
        //};
        try {
             result = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result.length() > 0 && !result.contains("failed"));
    }
}
