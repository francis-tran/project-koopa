package com.koopa.web.HelloModule.internal;

import com.koopa.web.HelloModule.HelloExternalAPI;
import com.koopa.web.HelloModule.HelloInternalAPI;

public interface HelloController extends HelloInternalAPI, HelloExternalAPI {}
