# Fuente
Library for using custom fonts divided into categories. 

![alt tag](https://user-images.githubusercontent.com/41512314/45253740-155bda00-b38a-11e8-9889-8bf2b3e37509.png)

![alt tag](https://img.shields.io/badge/build-development-green.svg)  

#  Contents 
**[Features](#features)**  
**[Implementation](#implementation)**   
**[API Usage](#api-usage)**  
**[Font Categories](#font-categories)**   
**[To-do](#to-do)**    
**[License](#license)**    


# Features

**a).** Can access fonts based on categories   
**b).** As of now, this library has 6 categories i.e. `Alien` `Animal` `Stencil` `BitmapPixel` `Blackletter` `Calligraphy`  
**c).** Easy to call API


# Implementation 

Library is available on JCenter, simply add the following line in your app `build.gradle` 
```
implementation'the.bot.box:fuente:{latest-version}'
```  
where `{latest-version}` corresponds to latest published version <a href='https://bintray.com/boxbotbarry/maven/fuente/_latestVersion'><img src='https://api.bintray.com/packages/boxbotbarry/maven/fuente/images/download.svg'></a>

# API Usage  
To set custom fonts on `TextView` simply call category you want to access and then the corrospending text in that category 
```
Fuente.CALLIGRAPHY.magnolia(context);
```
& set the font like this  
```
TextView mTextView = (TextView) findViewById(R.id.mTextView);
mTextView.setTypeface(Fuente.CALLIGRAPHY.magnolia(this));
```

# Font Categories  
```Fuente.ALIEN```  
```Fuente.ANIMAL```  
```Fuente.STENCIL```  
```Fuente.BITMAP_PIXEL```  
```Fuente.CALLIGRAPHY```  

# To-do
<ol>
  <li>Adding new categories </li> 
</ol> 

#   License  
![alt tag](https://img.shields.io/github/license/mashape/apistatus.svg)  
```
Copyright (c) 2018 TheBotBox

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
documentation files (the "Software"), to deal in the Software without restriction, including without
limitation the rights to use, copy, 
modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to 
whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions 
of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
CONTRACT, TORT OR OTHERWISE,ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
IN THE SOFTWARE.
```


