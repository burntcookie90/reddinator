/*
 * Copyright 2013 Michael Boyde Wallace (http://wallaceit.com.au)
 * This file is part of Reddinator.
 *
 * Reddinator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Reddinator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Reddinator (COPYING). If not, see <http://www.gnu.org/licenses/>.
 */
package au.com.wallaceit.reddinator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabFragment extends Fragment {
    /** (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
	private boolean mFirstTime = true;
	private LinearLayout ll;
	private static GlobalObjects global;
	private static String redditid;
	private TextView votestxt;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	this.setRetainInstance(true);
    	if (mFirstTime){
    		// Get global objects
//            global = ((GlobalObjects) getActivity().getApplicationContext());
//    		Bundle actbundle = getActivity().getIntent().getExtras();
//    		redditid = actbundle.getString(WidgetProvider.ITEM_ID);
//    		ll = (LinearLayout)inflater.inflate(R.layout.tab2, container, false);
//    		((TextView) ll.findViewById(R.id.posttext)).setText(actbundle.getString(WidgetProvider.ITEM_TXT));
//    		votestxt = (TextView) ll.findViewById(R.id.votestext);
//    		votestxt.setText(String.valueOf(actbundle.getInt(WidgetProvider.ITEM_VOTES)));
//    		ll.findViewById(R.id.upvotebtn).setOnClickListener(new OnClickListener(){
//				@Override
//				public void onClick(View v) {
//					//global.redditdata.vote(redditid, "1");
//				}
//			});
//    		ll.findViewById(R.id.downvotebtn).setOnClickListener(new OnClickListener(){
//				@Override
//				public void onClick(View v) {
//					//global.redditdata.vote(redditid, "-1");
//				}
//			});
//    		mFirstTime = false;
    	} else {
        	((ViewGroup) ll.getParent()).removeView(ll);
        }
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }
        return ll;
    }
}
