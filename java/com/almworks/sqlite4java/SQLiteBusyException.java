/*
 * Copyright 2010 ALM Works Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.almworks.sqlite4java;

import static com.almworks.sqlite4java.SQLiteConstants.Result;

public class SQLiteBusyException extends SQLiteException {
  public SQLiteBusyException(int errorCode, String errorMessage) {
    super(errorCode, errorMessage);
    assert errorCode == Result.SQLITE_BUSY || errorCode == Result.SQLITE_IOERR_BLOCKED : errorCode;
  }
}
