
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;


using Ecologylab.BigSemantics.Generated.Library.AcmAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.AcmPortalInstitutionNS;
using Ecologylab.BigSemantics.Generated.Library.AcmPortalPublicationNS;
using Ecologylab.BigSemantics.Generated.Library.AcmPortalSearchNS;
using Ecologylab.BigSemantics.Generated.Library.AcmScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.AmazonBookNS;
using Ecologylab.BigSemantics.Generated.Library.AmazonListNS;
using Ecologylab.BigSemantics.Generated.Library.AmazonProductNS;
using Ecologylab.BigSemantics.Generated.Library.AnandtechReviewNS;
using Ecologylab.BigSemantics.Generated.Library.AnthropologieProductNS;
using Ecologylab.BigSemantics.Generated.Library.AppleAccessoryProductNS;
using Ecologylab.BigSemantics.Generated.Library.AppleMacProductNS;
using Ecologylab.BigSemantics.Generated.Library.AppleProductNS;
using Ecologylab.BigSemantics.Generated.Library.ArtistNS;
using Ecologylab.BigSemantics.Generated.Library.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.AskNatureFunctionNS;
using Ecologylab.BigSemantics.Generated.Library.AskNatureGroupNS;
using Ecologylab.BigSemantics.Generated.Library.AskNatureImageNS;
using Ecologylab.BigSemantics.Generated.Library.AskNatureProductNS;
using Ecologylab.BigSemantics.Generated.Library.AskNatureSubgroupNS;
using Ecologylab.BigSemantics.Generated.Library.AsosPageNS;
using Ecologylab.BigSemantics.Generated.Library.AsosProductNS;
using Ecologylab.BigSemantics.Generated.Library.AttractionListNS;
using Ecologylab.BigSemantics.Generated.Library.AttractionNS;
using Ecologylab.BigSemantics.Generated.Library.AuthorNS;
using Ecologylab.BigSemantics.Generated.Library.BasicPublicationNS;
using Ecologylab.BigSemantics.Generated.Library.BedbathandbeyondProductNS;
using Ecologylab.BigSemantics.Generated.Library.BestbuyProductNS;
using Ecologylab.BigSemantics.Generated.Library.BggBoardGameNS;
using Ecologylab.BigSemantics.Generated.Library.BingSearchNS;
using Ecologylab.BigSemantics.Generated.Library.BlogNS;
using Ecologylab.BigSemantics.Generated.Library.BlogPostNS;
using Ecologylab.BigSemantics.Generated.Library.BoardGameNS;
using Ecologylab.BigSemantics.Generated.Library.BritishCartoonArchiveNS;
using Ecologylab.BigSemantics.Generated.Library.CameraNS;
using Ecologylab.BigSemantics.Generated.Library.CartoonNS;
using Ecologylab.BigSemantics.Generated.Library.Cb2ProductNS;
using Ecologylab.BigSemantics.Generated.Library.CiteseerXSimilarNS;
using Ecologylab.BigSemantics.Generated.Library.CiteseerxCitingNS;
using Ecologylab.BigSemantics.Generated.Library.CiteseerxRecordNS;
using Ecologylab.BigSemantics.Generated.Library.CiteseerxSearchNS;
using Ecologylab.BigSemantics.Generated.Library.CiteseerxSummaryNS;
using Ecologylab.BigSemantics.Generated.Library.CiteulikeAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.CiteulikePaperNS;
using Ecologylab.BigSemantics.Generated.Library.CiteulikeSearchNS;
using Ecologylab.BigSemantics.Generated.Library.CiteulikeTagNS;
using Ecologylab.BigSemantics.Generated.Library.CiteulikeUserNS;
using Ecologylab.BigSemantics.Generated.Library.CnetReviewNS;
using Ecologylab.BigSemantics.Generated.Library.CommentNS;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS;
using Ecologylab.BigSemantics.Generated.Library.ContactPointNS;
using Ecologylab.BigSemantics.Generated.Library.CrateAndBarrelProductNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWork.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CurationNS;
using Ecologylab.BigSemantics.Generated.Library.DisasterNS;
using Ecologylab.BigSemantics.Generated.Library.DleseRecordNS;
using Ecologylab.BigSemantics.Generated.Library.DleseUserSearchNS;
using Ecologylab.BigSemantics.Generated.Library.DreamHouseNS;
using Ecologylab.BigSemantics.Generated.Library.DublinCoreNS;
using Ecologylab.BigSemantics.Generated.Library.EarthquakeNS;
using Ecologylab.BigSemantics.Generated.Library.EbayProductNS;
using Ecologylab.BigSemantics.Generated.Library.EtsyProductNS;
using Ecologylab.BigSemantics.Generated.Library.EventNS;
using Ecologylab.BigSemantics.Generated.Library.ExhibitionNS;
using Ecologylab.BigSemantics.Generated.Library.FashionReviewerNS;
using Ecologylab.BigSemantics.Generated.Library.FastflipNS;
using Ecologylab.BigSemantics.Generated.Library.FlamencoFacetNS;
using Ecologylab.BigSemantics.Generated.Library.FlamencoObjectNS;
using Ecologylab.BigSemantics.Generated.Library.FlickrAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.FlickrPhotoPostNS;
using Ecologylab.BigSemantics.Generated.Library.FlickrPhotostreamNS;
using Ecologylab.BigSemantics.Generated.Library.FlickrTagNS;
using Ecologylab.BigSemantics.Generated.Library.FondationArticleNS;
using Ecologylab.BigSemantics.Generated.Library.FondationCollectionNS;
using Ecologylab.BigSemantics.Generated.Library.FondationTagNS;
using Ecologylab.BigSemantics.Generated.Library.Forever21ProductNS;
using Ecologylab.BigSemantics.Generated.Library.GaurdianComicNS;
using Ecologylab.BigSemantics.Generated.Library.GetttyArtistNS;
using Ecologylab.BigSemantics.Generated.Library.GettyArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.GettyCollectionNS;
using Ecologylab.BigSemantics.Generated.Library.GettyExplorationNS;
using Ecologylab.BigSemantics.Generated.Library.GettySearchNS;
using Ecologylab.BigSemantics.Generated.Library.GisLocationNS;
using Ecologylab.BigSemantics.Generated.Library.GlobeCartoonNS;
using Ecologylab.BigSemantics.Generated.Library.GoogleBookNS;
using Ecologylab.BigSemantics.Generated.Library.GooglePatentAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.GooglePatentNS;
using Ecologylab.BigSemantics.Generated.Library.GoogleScholarArticleNS;
using Ecologylab.BigSemantics.Generated.Library.GoogleScholarAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.GoogleScholarSearchNS;
using Ecologylab.BigSemantics.Generated.Library.GoogleSearchNS;
using Ecologylab.BigSemantics.Generated.Library.GrantNS;
using Ecologylab.BigSemantics.Generated.Library.GrantProgramNS;
using Ecologylab.BigSemantics.Generated.Library.GrantStaffNS;
using Ecologylab.BigSemantics.Generated.Library.GuggenArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.GuggenFilterNS;
using Ecologylab.BigSemantics.Generated.Library.HmProductNS;
using Ecologylab.BigSemantics.Generated.Library.HomeDepotProductNS;
using Ecologylab.BigSemantics.Generated.Library.HotelNS;
using Ecologylab.BigSemantics.Generated.Library.IcdlBookPreviewNS;
using Ecologylab.BigSemantics.Generated.Library.IcdlNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeArticleBodyNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeArticleNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeCitedByNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeJournalNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeKeywordsNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeReferencesNS;
using Ecologylab.BigSemantics.Generated.Library.IeeeSearchNS;
using Ecologylab.BigSemantics.Generated.Library.IkeaProductNS;
using Ecologylab.BigSemantics.Generated.Library.ImageSearchNS;
using Ecologylab.BigSemantics.Generated.Library.ImdbMovieNS;
using Ecologylab.BigSemantics.Generated.Library.ImdbMoviePersonNS;
using Ecologylab.BigSemantics.Generated.Library.InformaWorldScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.InstructableAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.InstructableNS;
using Ecologylab.BigSemantics.Generated.Library.InstructablesTagNS;
using Ecologylab.BigSemantics.Generated.Library.InvestigatorNS;
using Ecologylab.BigSemantics.Generated.Library.ItemNS;
using Ecologylab.BigSemantics.Generated.Library.JstorArticleNS;
using Ecologylab.BigSemantics.Generated.Library.JstorJournalNS;
using Ecologylab.BigSemantics.Generated.Library.JstorSearchNS;
using Ecologylab.BigSemantics.Generated.Library.LeagueoflegendsNS;
using Ecologylab.BigSemantics.Generated.Library.LowesProductNS;
using Ecologylab.BigSemantics.Generated.Library.MetArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.MetFilterNS;
using Ecologylab.BigSemantics.Generated.Library.MmArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.ModclothProductNS;
using Ecologylab.BigSemantics.Generated.Library.ModclothSearchNS;
using Ecologylab.BigSemantics.Generated.Library.MomaArtistNS;
using Ecologylab.BigSemantics.Generated.Library.MomaArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.MovieNS;
using Ecologylab.BigSemantics.Generated.Library.MoviePersonNS;
using Ecologylab.BigSemantics.Generated.Library.NetflixMovieNS;
using Ecologylab.BigSemantics.Generated.Library.NewMuseumArtistNS;
using Ecologylab.BigSemantics.Generated.Library.NewMuseumArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.NeweggProductNS;
using Ecologylab.BigSemantics.Generated.Library.NewmuseumExhibitionNS;
using Ecologylab.BigSemantics.Generated.Library.NewmuseumFilterNS;
using Ecologylab.BigSemantics.Generated.Library.NewsArticleNS;
using Ecologylab.BigSemantics.Generated.Library.NsdlDocumentNS;
using Ecologylab.BigSemantics.Generated.Library.NsdlServiceNS;
using Ecologylab.BigSemantics.Generated.Library.NsfAwardGrantNS;
using Ecologylab.BigSemantics.Generated.Library.NsfDivisionNS;
using Ecologylab.BigSemantics.Generated.Library.NsfInvestigatorNS;
using Ecologylab.BigSemantics.Generated.Library.NsfProgramNS;
using Ecologylab.BigSemantics.Generated.Library.NsfSearchNS;
using Ecologylab.BigSemantics.Generated.Library.NsfStaffListNS;
using Ecologylab.BigSemantics.Generated.Library.NsfStaffNS;
using Ecologylab.BigSemantics.Generated.Library.NytimesArticleNS;
using Ecologylab.BigSemantics.Generated.Library.OnekingslaneProductNS;
using Ecologylab.BigSemantics.Generated.Library.OpenDNSDomainNS;
using Ecologylab.BigSemantics.Generated.Library.OpmlNS;
using Ecologylab.BigSemantics.Generated.Library.OverstockProductNS;
using Ecologylab.BigSemantics.Generated.Library.PatentAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.PatentClassificationNS;
using Ecologylab.BigSemantics.Generated.Library.PatentNS;
using Ecologylab.BigSemantics.Generated.Library.PeriodicalNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
using Ecologylab.BigSemantics.Generated.Library.PieroneProductNS;
using Ecologylab.BigSemantics.Generated.Library.PinterestNS;
using Ecologylab.BigSemantics.Generated.Library.PoliticalCartoonNS;
using Ecologylab.BigSemantics.Generated.Library.PostalAddressNS;
using Ecologylab.BigSemantics.Generated.Library.PotterybarnProductNS;
using Ecologylab.BigSemantics.Generated.Library.PrimitivesNS;
using Ecologylab.BigSemantics.Generated.Library.ProductNS;
using Ecologylab.BigSemantics.Generated.Library.PublicationNS;
using Ecologylab.BigSemantics.Generated.Library.PublisherNS;
using Ecologylab.BigSemantics.Generated.Library.PubmedArticleNS;
using Ecologylab.BigSemantics.Generated.Library.PubmedAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.PubmedJournalNS;
using Ecologylab.BigSemantics.Generated.Library.RatingNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchGateSearchNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchgateArticleNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchgateAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchgateInstitutionDepartmentNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchgateInstitutionNS;
using Ecologylab.BigSemantics.Generated.Library.ResearchgateResearcherNS;
using Ecologylab.BigSemantics.Generated.Library.RestaurantNS;
using Ecologylab.BigSemantics.Generated.Library.RestorationHardwareProductNS;
using Ecologylab.BigSemantics.Generated.Library.ReviewNS;
using Ecologylab.BigSemantics.Generated.Library.RhizomeArtistNS;
using Ecologylab.BigSemantics.Generated.Library.RhizomeArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.RhizomeCollectionNS;
using Ecologylab.BigSemantics.Generated.Library.RhizomeTagNS;
using Ecologylab.BigSemantics.Generated.Library.RoomandboardProductNS;
using Ecologylab.BigSemantics.Generated.Library.RottenTomatoeMovieNS;
using Ecologylab.BigSemantics.Generated.Library.RottenTomatoeMoviePersonNS;
using Ecologylab.BigSemantics.Generated.Library.Rss22NS;
using Ecologylab.BigSemantics.Generated.Library.RssNS;
using Ecologylab.BigSemantics.Generated.Library.RwandaPersonnelInterviewNS;
using Ecologylab.BigSemantics.Generated.Library.RwandaTribunalVoicesNS;
using Ecologylab.BigSemantics.Generated.Library.RwandaVideoInterviewNS;
using Ecologylab.BigSemantics.Generated.Library.SamsclubProductNS;
using Ecologylab.BigSemantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.ScopusArticleNS;
using Ecologylab.BigSemantics.Generated.Library.ScopusAuthorNS;
using Ecologylab.BigSemantics.Generated.Library.ScopusSearchNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.Generated.Library.ServiceNS;
using Ecologylab.BigSemantics.Generated.Library.SfuCartoonArchiveNS;
using Ecologylab.BigSemantics.Generated.Library.SlashdotPostNS;
using Ecologylab.BigSemantics.Generated.Library.SlashdotRSSNS;
using Ecologylab.BigSemantics.Generated.Library.SlashdotSearchNS;
using Ecologylab.BigSemantics.Generated.Library.TargetProductNS;
using Ecologylab.BigSemantics.Generated.Library.TateArtistNS;
using Ecologylab.BigSemantics.Generated.Library.TateArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.TateFilterNS;
using Ecologylab.BigSemantics.Generated.Library.TechReviewNS;
using Ecologylab.BigSemantics.Generated.Library.ThumbnailNS;
using Ecologylab.BigSemantics.Generated.Library.TigerdirectProductNS;
using Ecologylab.BigSemantics.Generated.Library.TripAdvisorNS;
using Ecologylab.BigSemantics.Generated.Library.TrumanCampaignCartoonNS;
using Ecologylab.BigSemantics.Generated.Library.TumblrPostNS;
using Ecologylab.BigSemantics.Generated.Library.TumblrSearchNS;
using Ecologylab.BigSemantics.Generated.Library.TvShowEpisodeNS;
using Ecologylab.BigSemantics.Generated.Library.TvShowNS;
using Ecologylab.BigSemantics.Generated.Library.TvtropesNS;
using Ecologylab.BigSemantics.Generated.Library.TweetNS;
using Ecologylab.BigSemantics.Generated.Library.TweeterNS;
using Ecologylab.BigSemantics.Generated.Library.TwitterBlogNS;
using Ecologylab.BigSemantics.Generated.Library.TwitterSearchNS;
using Ecologylab.BigSemantics.Generated.Library.UniqloProductNS;
using Ecologylab.BigSemantics.Generated.Library.UrbanspoonSearchNS;
using Ecologylab.BigSemantics.Generated.Library.VideoNS;
using Ecologylab.BigSemantics.Generated.Library.WalmartProductNS;
using Ecologylab.BigSemantics.Generated.Library.WeatherReportNS;
using Ecologylab.BigSemantics.Generated.Library.WestelmProductNS;
using Ecologylab.BigSemantics.Generated.Library.WhitneyArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.WhitneyDecadeNS;
using Ecologylab.BigSemantics.Generated.Library.WhitneySearchNS;
using Ecologylab.BigSemantics.Generated.Library.WhitneyWatchAndListenNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaMobileNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaPageNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaPageTypeNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaSearchNS;
using Ecologylab.BigSemantics.Generated.Library.YahooRssNS;
using Ecologylab.BigSemantics.Generated.Library.YahooSearchNS;
using Ecologylab.BigSemantics.Generated.Library.YelpBusinessNS;
using Ecologylab.BigSemantics.Generated.Library.ZaraProductNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations;

// Developer should proof-read this TranslationScope before using it for production.
namespace Ecologylab.BigSemantics.Generated.Library 
{
	public class RepositoryMetadataTypesScope
	{
		public RepositoryMetadataTypesScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("repository_metadata", MetadataBuiltinsTypesScope.Get(),
				typeof(AcmPortal),
				typeof(AcmPortalAuthor),
				typeof(AcmPortalAuthorCollaborators),
				typeof(AcmPortalAuthorPublicationDetail),
				typeof(AcmPortalInstitutionProfile),
				typeof(AcmPortalPeriodical),
				typeof(AcmPortalSearch),
				typeof(AcmPortalSearchResult),
				typeof(AdditionalMetadata),
				typeof(AmazonBook),
				typeof(AmazonList),
				typeof(AmazonProduct),
				typeof(AnandtechReview),
				typeof(Anthropologie),
				typeof(AppleIProduct),
				typeof(AppleProductAccessory),
				typeof(AppleProductMac),
				typeof(Artist),
				typeof(Artwork),
				typeof(AskNatureExpert),
				typeof(AskNatureFunction),
				typeof(AskNatureGroup),
				typeof(AskNatureImage),
				typeof(AskNatureOrganism),
				typeof(AskNatureProduct),
				typeof(AskNatureStrategy),
				typeof(AskNatureSubgroup),
				typeof(AskNatureTaxonomy),
				typeof(Asos),
				typeof(AsosPage),
				typeof(Attraction),
				typeof(AttractionList),
				typeof(Audience),
				typeof(AudioClipping),
				typeof(AudioSelfmade),
				typeof(Author),
				typeof(BasicPublication),
				typeof(BedbathandbeyondProduct),
				typeof(BestbuyProduct),
				typeof(BggCategory),
				typeof(BggGame),
				typeof(BingSearchApi),
				typeof(BingSearchXpath),
				typeof(BirthDetail),
				typeof(Blog),
				typeof(BoardGame),
				typeof(Body),
				typeof(Book),
				typeof(BritishCartoonArchive),
				typeof(CachedHtml),
				typeof(CameraSettings),
				typeof(Cartoon),
				typeof(CategoryInterviews),
				typeof(Cb2Product),
				typeof(Channel),
				typeof(CitationInfo),
				typeof(CiteseerxCiting),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSimilar),
				typeof(CiteseerxSummary),
				typeof(CiteulikeAuthor),
				typeof(CiteulikePaper),
				typeof(CiteulikeSearch),
				typeof(CiteulikeTag),
				typeof(CiteulikeUser),
				typeof(CnetReview),
				typeof(Collection),
				typeof(Comment),
				typeof(Commodity),
				typeof(ContactPoint),
				typeof(Contributor),
				typeof(CrateandbarrelProduct),
				typeof(CreativeWork),
				typeof(Curation),
				typeof(DateInfo),
				typeof(Dc),
				typeof(DcDocument),
				typeof(Disaster),
				typeof(DleseGetRecord),
				typeof(DleseRecord),
				typeof(DleseRecord2),
				typeof(DleseRecordHead),
				typeof(DleseUserSearch),
				typeof(Dlms),
				typeof(Earthquake),
				typeof(EbayProduct),
				typeof(Educational),
				typeof(EtsyProduct),
				typeof(Event),
				typeof(Exhibition),
				typeof(FashionReviewer),
				typeof(FastflipSearch),
				typeof(FlamencoFacet),
				typeof(FlamencoObject),
				typeof(FlickrAuthor),
				typeof(FlickrPhoto),
				typeof(FlickrTag),
				typeof(FondationArticle),
				typeof(FondationCategoryCollection),
				typeof(FondationCollection),
				typeof(FondationTag),
				typeof(Forever21),
				typeof(GaurdianComic),
				typeof(General),
				typeof(GetRecordAdditionalMetadata),
				typeof(GettyArtist),
				typeof(GettyArtistInfo),
				typeof(GettyCollection),
				typeof(GettyExploration),
				typeof(GettyObject),
				typeof(GettySearch),
				typeof(GettyWorkInfo),
				typeof(GisLocation),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GooglePatent),
				typeof(GooglePatentAuthor),
				typeof(GoogleScholarArticle),
				typeof(GoogleScholarArticleFacts),
				typeof(GoogleScholarAuthor),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSearch),
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
				typeof(GuggenArtwork),
				typeof(GuggenFilter),
				typeof(Head),
				typeof(Head2),
				typeof(Header),
				typeof(HmProduct),
				typeof(HomeDepotProduct),
				typeof(Hotel),
				typeof(IcdlBook),
				typeof(IcdlBookPreview),
				typeof(IcdlImage),
				typeof(IcdlImageResult),
				typeof(Icsmd),
				typeof(IeeeArticleBody),
				typeof(IeeeAuthorPage),
				typeof(IeeeJournalPage),
				typeof(IeeeKeywords),
				typeof(IeeeXploreArticle),
				typeof(IeeeXploreCitedBy),
				typeof(IeeeXploreReferences),
				typeof(IeeeXploreSearch),
				typeof(IkeaDepartment),
				typeof(IkeaProduct),
				typeof(ImageSearch),
				typeof(ImageSearchResult),
				typeof(ImdbMovie),
				typeof(ImdbPerson),
				typeof(InformaWorld),
				typeof(InformationCompositionMedia),
				typeof(Instructable),
				typeof(InstructableAuthor),
				typeof(InstructableComment),
				typeof(InstructableTag),
				typeof(Investigator<>),
				typeof(Item),
				typeof(ItemRecord),
				typeof(JstorArticle),
				typeof(JstorJournal),
				typeof(JstorSearch),
				typeof(LabeledSpecifications),
				typeof(LandofnodProduct),
				typeof(LeagueAbility),
				typeof(LeagueChampion),
				typeof(LeagueRelationshipList),
				typeof(Lifecycle),
				typeof(LowesProduct),
				typeof(MacheClipping),
				typeof(MediaContent),
				typeof(MediaProvider),
				typeof(MetArtwork),
				typeof(MetFilter),
				typeof(MmArtwork),
				typeof(Modcloth),
				typeof(ModclothSearch),
				typeof(MomaArtist),
				typeof(MomaArtwork),
				typeof(Movie),
				typeof(MoviePerson),
				typeof(NetflixMovie),
				typeof(NeweggProduct),
				typeof(NeweggSubcategoryList),
				typeof(NewmuseumArtist),
				typeof(NewmuseumArtwork),
				typeof(NewmuseumExhibition),
				typeof(NewmuseumFilter),
				typeof(NewsArticle),
				typeof(Nsdl),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(NsfAward),
				typeof(NsfDivision),
				typeof(NsfDivisionStaffList),
				typeof(NsfInvestigator),
				typeof(NsfProgram),
				typeof(NsfProgramStaffList),
				typeof(NsfSearch),
				typeof(NsfStaff),
				typeof(Nytimes),
				typeof(OnekingslaneProduct),
				typeof(OpenDNSDomain),
				typeof(Opml),
				typeof(Organization),
				typeof(Outline),
				typeof(OverstockComProduct),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PatentAuthor),
				typeof(PatentClassification),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(Person),
				typeof(PersonnelInterview),
				typeof(Photostream),
				typeof(PieroneProduct),
				typeof(PinterestPin),
				typeof(PoliticalCartoon),
				typeof(Post),
				typeof(PostalAddress),
				typeof(PotterybarnProduct),
				typeof(Product),
				typeof(Publication),
				typeof(Publisher),
				typeof(PubmedArticle),
				typeof(PubmedAuthor),
				typeof(PubmedJournal),
				typeof(Rating),
				typeof(RecordMetaMetadata),
				typeof(RecordMetadata),
				typeof(ResearchGateArticle),
				typeof(ResearchGateArticleStats),
				typeof(ResearchGateAuthor),
				typeof(ResearchGateInstitution),
				typeof(ResearchGateInstitutionContactInfo),
				typeof(ResearchGateInstitutionDepartment),
				typeof(ResearchGateResearcher),
				typeof(ResearchGateResult),
				typeof(ResearchGateSearch),
				typeof(ResearchGateStats),
				typeof(Restaurant),
				typeof(RestaurantGenre),
				typeof(RestorationhardwareProduct),
				typeof(ResultInfo),
				typeof(Review),
				typeof(RhizomeArtist),
				typeof(RhizomeArtwork),
				typeof(RhizomeCollection),
				typeof(RhizomeTag),
				typeof(RoomandboardProduct),
				typeof(RottenMovie),
				typeof(RottenPerson),
				typeof(Rss),
				typeof(Rss22),
				typeof(SamsclubProduct),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(ScopusArticle),
				typeof(ScopusAuthor),
				typeof(ScopusSearch),
				typeof(Search<>),
				typeof(SearchCrumb),
				typeof(SearchResult),
				typeof(SearchResults),
				typeof(SearchSection),
				typeof(Section),
				typeof(Sections),
				typeof(Seller),
				typeof(Service),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SocialMediaSearchResult),
				typeof(SocialVideo),
				typeof(Specification),
				typeof(Subject),
				typeof(TargetProduct),
				typeof(TateArtist),
				typeof(TateArtwork),
				typeof(TateFilter),
				typeof(TechReview),
				typeof(TempFieldValueHolder),
				typeof(TermType),
				typeof(Thumbnail),
				typeof(TigerdirectProduct),
				typeof(TribunalVoices),
				typeof(TripAdvisorThingsToDo),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(Tumblr),
				typeof(TumblrSearch),
				typeof(TvShow),
				typeof(TvShowEpisode),
				typeof(Tvtrope),
				typeof(TvtropeExample),
				typeof(TvtropeFolder),
				typeof(Tweet),
				typeof(Tweeter),
				typeof(TwitterMicroblog),
				typeof(TwitterSearchResults),
				typeof(UniqloProduct),
				typeof(UrbanSpoonSearch),
				typeof(VideoClipping),
				typeof(VideoInterview),
				typeof(VideoSelfmade),
				typeof(WalmartProduct),
				typeof(WeatherReport),
				typeof(WebVideo),
				typeof(WestelmProduct),
				typeof(WhitneyArtwork),
				typeof(WhitneyDecade),
				typeof(WhitneySearch),
				typeof(WhitneyWatchAndListen),
				typeof(WikipediaCategoryType),
				typeof(WikipediaMobilePage),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(WikipediaSearch),
				typeof(WileyArticle),
				typeof(YahooGeoCode),
				typeof(YahooGeoCodeResult),
				typeof(YahooMediaRss),
				typeof(YahooResult),
				typeof(YahooResultSet),
				typeof(YahooThumbnail),
				typeof(YelpBusiness),
				typeof(YoutubeChannel),
				typeof(YoutubeSearchResults),
				typeof(YoutubeVideo),
				typeof(YoutubeVideoList),
				typeof(ZaraProduct));
		}
	}
}
