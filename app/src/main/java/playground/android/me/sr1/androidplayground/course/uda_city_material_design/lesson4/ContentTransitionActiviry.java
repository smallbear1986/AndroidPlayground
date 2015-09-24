package playground.android.me.sr1.androidplayground.course.uda_city_material_design.lesson4;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import playground.android.me.sr1.androidplayground.App;
import playground.android.me.sr1.androidplayground.R;

/**
 * ContentTransition示例类
 * Created by srluo on 2015/9/24.
 */
public class ContentTransitionActiviry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_uda_material_design_l4_content_transition);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapter(this, 100));
    }
}

class GridAdapter extends BaseAdapter {

    private Context mContext;
    private int mCount;

    public GridAdapter(Context context, int count) {
        mCount = count;
        mContext = context.getApplicationContext();
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_course_uda_material_design_l4_content_transition, null);
        }
        return convertView;
    }
}