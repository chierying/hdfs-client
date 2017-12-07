package com.example.wordcount;

import lombok.Data;

/**
 * 单词计数引擎
 */
public interface WordCountManager {
    void increase();

    int getCount();

    @Data
    class Default implements WordCountManager {
        private int count;

        @Override
        public void increase() {
            count++;
        }


    }
}
