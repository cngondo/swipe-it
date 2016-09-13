package swipe.example.com.swipeit;

import android.support.v7.widget.helper.ItemTouchHelper;


public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}
