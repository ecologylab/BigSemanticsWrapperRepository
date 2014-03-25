using System;
using Ecologylab.Semantics.Generated.Library.PrimitivesNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Serialization;

namespace Ecologylab.Semantics.Generated
{
    public class RichMediaTypeScope
    {
        public static readonly string Name = "repository_media";

        protected static readonly Type[] Translations =
            {
                typeof (HtmlText),
                typeof (Image),
                typeof (WebVideo),
                typeof (Video),
                typeof (Audio)
            };

        public static SimplTypesScope Get()
        {
            return SimplTypesScope.Get(Name, Translations);
        }
    }
}
