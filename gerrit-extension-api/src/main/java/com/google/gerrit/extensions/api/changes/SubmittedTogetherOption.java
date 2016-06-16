// Copyright (C) 2016 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.extensions.api.changes;

import java.util.EnumSet;

/** Output options available for submitted_together requests. */
public enum SubmittedTogetherOption {
  NON_VISIBLE_CHANGES(0);

  private final int value;

  SubmittedTogetherOption(int v) {
    value = v;
  }

  public int getValue() {
    return value;
  }
}
