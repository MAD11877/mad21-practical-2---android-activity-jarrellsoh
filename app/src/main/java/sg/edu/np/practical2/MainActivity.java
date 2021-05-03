package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User();
        Button fButton = findViewById(R.id.Followbtn);
        fButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String fText = fButton.getText().toString();
                if (user1.isFollowed()) {
                    fButton.setText("Unfollow");
                    user1.setFollowed(false);
                }
                else {
                    fButton.setText("Follow");
                    user1.setFollowed(false);
                }

            }

        });
    }
}