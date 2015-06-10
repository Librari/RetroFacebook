/*
 * Copyright (C) 2015 8tory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofacebook;

import rx.Observable;
import rx.functions.*;

@RetroFacebook
public abstract class Facebook {
  @RetroFacebook.GET("/{postId}")
  public abstract Observable<Post> getPost(@RetroFacebook.Path String postId, String type);

  public static Facebook create() {
      return new RetroFacebook_Facebook();
  }
}
