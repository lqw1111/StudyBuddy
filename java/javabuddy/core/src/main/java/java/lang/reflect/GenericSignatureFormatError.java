/*
 * @(#)GenericSignatureFormatError.java	1.3 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.lang.reflect;


/**
 * Thrown when a syntactically malformed signature attribute is
 * encountered by a reflective method that needs to interpret the
 * generic signature information for a type, method or constructor.
 *
 * @since 1.5
 */
public class GenericSignatureFormatError extends ClassFormatError{}
