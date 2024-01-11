/*
 * Copyright 2017 Herman Cheung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package hkhc.electricspock.sample;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by herman on 17/3/2017.
 */

@RunWith(RobolectricTestRunner.class)
public class HelloWorldTest {

    @Test
    public void test1() {

        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();

        CharSequence text = mainActivity.helloTextView.getText();

        assertEquals(
                "Hello World!",text);

    }

}
