package com.docusign.maestro.client.auth;

import com.docusign.maestro.client.auth.OAuth.OAuthToken;

public interface AccessTokenListener {
  void notify(OAuthToken token);
}