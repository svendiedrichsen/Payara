/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.jts.codegen.jtsxa;


/**
* com/sun/jts/codegen/jtsxa/OTSResourceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from com/sun/jts/jtsxa.idl
* Tuesday, February 5, 2002 12:57:25 PM PST
*/


//#-----------------------------------------------------------------------------
abstract public class OTSResourceHelper
{
  private static String  _id = "IDL:jtsxa/OTSResource:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.jts.codegen.jtsxa.OTSResource that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.jts.codegen.jtsxa.OTSResource extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (com.sun.jts.codegen.jtsxa.OTSResourceHelper.id (), "OTSResource");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.jts.codegen.jtsxa.OTSResource read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_OTSResourceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.jts.codegen.jtsxa.OTSResource value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static com.sun.jts.codegen.jtsxa.OTSResource narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof com.sun.jts.codegen.jtsxa.OTSResource)
      return (com.sun.jts.codegen.jtsxa.OTSResource)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      com.sun.jts.codegen.jtsxa._OTSResourceStub stub = new com.sun.jts.codegen.jtsxa._OTSResourceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}