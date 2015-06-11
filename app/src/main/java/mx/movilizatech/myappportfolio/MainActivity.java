package mx.movilizatech.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyButton(View view){
        Toast.makeText(this, R.string.spotify, Toast.LENGTH_SHORT).show();
    }

    public void scoresButton(View view){
        Toast.makeText(this,R.string.scores_app,Toast.LENGTH_SHORT).show();
    }

    public void libraryButton(View view){
        Toast.makeText(this,R.string.library_app,Toast.LENGTH_SHORT).show();
    }

    public void buildItButton(View view){
        Toast.makeText(this, R.string.build_it, Toast.LENGTH_SHORT).show();
    }

    public void baconButton(View view){
        Toast.makeText(this, R.string.bacon_reader, Toast.LENGTH_SHORT).show();
    }

    public void capstoneButton(View view){
        Toast.makeText(this,R.string.capstone,Toast.LENGTH_SHORT).show();
    }
}
