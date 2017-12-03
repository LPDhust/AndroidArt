// IOnNewBookArrivedListener.aidl
package com.ryg.chapter_2.aidl;

import com.ryg.chapter_2.aidl.Book;
// Declare any non-default types here with import statements

interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}
