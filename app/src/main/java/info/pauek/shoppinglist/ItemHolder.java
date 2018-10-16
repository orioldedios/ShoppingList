package info.pauek.shoppinglist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {
    private TextView name_view;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        name_view = itemView.findViewById(R.id.name_view);
    }

    public void bind(ShoppingItem item) {
        name_view.setText(item.getName());
    }
}
