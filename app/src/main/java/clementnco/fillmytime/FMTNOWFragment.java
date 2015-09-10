package clementnco.fillmytime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ClÃ©ment on 08/09/2015.
 */
public class FMTNOWFragment extends Fragment {
    protected EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_fmtnow, container);
        editText = (EditText)view.findViewById(R.id.minutesField);
        Button btn = (Button)view.findViewById(R.id.buttonFMT);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(editText.getText().toString());

                if (editText.getText().length() != 0) {



                    int nbr = Integer.parseInt(editText.getText().toString());
                    FragmentManager fm = getFragmentManager();
                    ResultFragment rf = new ResultFragment();
                    Bundle args = new Bundle();
                    args.putInt("time", nbr);
                    rf.setArguments(args);
                    fm.beginTransaction().replace(R.id.container, rf).commit();

                }
            }
        });
        return null;
    }


}
