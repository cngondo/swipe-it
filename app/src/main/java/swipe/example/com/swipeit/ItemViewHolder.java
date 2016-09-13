package swipe.example.com.swipeit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ngondo on 9/12/16.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public final TextView textView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textViewItem);
    }
}
